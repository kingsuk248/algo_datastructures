package com.dsa.graphs;

public class Vertex {
	public char label;
	public boolean wasVisited;
	public boolean isInTree;
	
	public Vertex(char label) {
		this.label = label;
		wasVisited = false;
		isInTree = false;
	}
}
