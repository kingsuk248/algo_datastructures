package com.dsa.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PostfixApp {
	public static void main(String[] args) throws IOException {
		PostfixApp app = new PostfixApp();
		String inputString = app.getInputString();
		ParsePost parsePost = new ParsePost(inputString);
		System.out.println(inputString + " evaluates to: " + parsePost.doParse());
	}

	private String getInputString() throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		return bufferedReader.readLine();
	}
}
