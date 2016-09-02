package com.dsa.graphs;

public class GraphTS {
	private final int MAX_VERTS = 20;
	private int[][] adjMatrix;
	private Vertex[] vertices;
	private int nVerts;
	private char[] sortedArray;
	
	public GraphTS() {
		vertices = new Vertex[MAX_VERTS];
		adjMatrix = new int[MAX_VERTS][MAX_VERTS];
		sortedArray = new char[MAX_VERTS];
	}
	
	public void addVertex(char ch) {
		//TODO
	}
	
	public void addEdge(int start, int end) {
		//TODO
	}
	
	public void displayVertex(int v) {
		//TODO
	}
	
	public void topoSort() {
		//TODO
	}
	
	public int noSuccessors() {
		//TODO
		return 0;
	}
	
	public void deleteVertex(int delVer) {
		//TODO
	}
	
	private void moveRowUp(int row, int length) {
		//TODO
	}
	
	private void moveColLeft(int col, int length) {
		
	}
}
