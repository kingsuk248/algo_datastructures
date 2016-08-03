package com.dsa.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverserApp {
	public static void main(String[] args) throws IOException {
		ReverserApp ra = new ReverserApp();
		String inputString = ra.getInput();
		Reverser reverser = new Reverser(inputString);
		System.out.println("The string '" + inputString + "' reversed is '" + reverser.doReversing() + "'");
	}
	
	public String getInput() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		return reader.readLine();
	}
}
