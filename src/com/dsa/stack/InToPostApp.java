package com.dsa.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InToPostApp {
	public static void main(String[] args) throws IOException {
		InToPostApp app = new InToPostApp();
		String inputString = app.getInputString();
		InToPost inToPost = new InToPost(inputString);
		System.out.println("Postfix of " + inputString + " : " + inToPost.doTranslation());
	}

	private String getInputString() throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		return bufferedReader.readLine();
	}
}
