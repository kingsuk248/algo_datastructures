package com.dsa.stack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BracketCheckerApp {
	public static void main(String[] args) throws IOException {
		String input = new BracketCheckerApp().getString();
		BracketChecker bracketChecker = new BracketChecker(input);
		bracketChecker.check();
	}
	
	public String getString() throws IOException {
		return new BufferedReader(new InputStreamReader(System.in)).readLine();
	}
}
