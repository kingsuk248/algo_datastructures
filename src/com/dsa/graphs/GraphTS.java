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
		vertices[nVerts++] = new Vertex(ch);
	}
	
	public void addEdge(int start, int end) {
		adjMatrix[start][end] = 1;
	}
	
	public void displayVertex(int v) {
		System.out.print(vertices[v].label + " ");
	}
	
	public void topoSort() {
		int oriNVerts = nVerts;
		while (nVerts > 0) {
			int currentVertex = noSuccessors();
			if (currentVertex == -1) {
				System.out.println("Cyclic graph... Topo sort not possible...");
				return;
			}
			sortedArray[nVerts - 1] = vertices[currentVertex].label;
			deleteVertex(currentVertex);
		}
		System.out.println("Topologically sorted order...");
		for (int i = 0; i < oriNVerts; i++) {
			System.out.print(sortedArray[i]);
		}
		System.out.println();
	}
	
	public int noSuccessors() {
		boolean isEdge;
		for (int row = 0; row < nVerts; row++) {
			isEdge = false;
			for (int col = 0; col < nVerts; col++) {
				if (adjMatrix[row][col] > 0) {
					isEdge = true;
					break;
				}
			}
			if (!isEdge) {
				return row;
			}
		}
		return -1;
	}
	
	public void deleteVertex(int delVer) {
		if (delVer != nVerts - 1) {
			for (int i = delVer; i < nVerts; i++) {
				vertices[i] = vertices[i + 1];
			}
			for (int row = delVer; row < nVerts; row++) {
				moveRowUp(row, nVerts);
			}
			for (int col = delVer; col < nVerts; col++) {
				moveColLeft(col, nVerts);
			}
		}
		nVerts--;
	}
	
	private void moveRowUp(int row, int length) {
		for (int col = 0; col < length; col++) {
			adjMatrix[row][col] = adjMatrix[row+1][col]; 
		}
	}
	
	private void moveColLeft(int col, int length) {
		for (int row = 0; row < length; row++) {
			adjMatrix[row][col] = adjMatrix[row][col + 1];
		}
	}
}
