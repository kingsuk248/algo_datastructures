package com.dsa.util.methods;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Utility {
	public static int getInt() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		try {
			str = reader.readLine();
		} catch (IOException io) {
			io.printStackTrace();
		}
		return Integer.parseInt(str);
	}
	
	public static String getString() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		try {
			str = reader.readLine();
		} catch (IOException io) {
			io.printStackTrace();
		}
		return str;
	}
	
	public static char getChar() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		try {
			str = reader.readLine();
		} catch (IOException io) {
			io.printStackTrace();
		}
		return str.charAt(0);
	}
}
