package com.dsa.graphs;

public class GraphDFS {
	private int MAX_VERTICES = 20;
	private Vertex[] vertices;
	private int[][] adjMatrix;
	private int numVertices;
	private StackX stack;
	
	public GraphDFS(int size) {
		vertices = new Vertex[MAX_VERTICES];
		adjMatrix = new int[MAX_VERTICES][MAX_VERTICES];
		stack = new StackX();
	}
	
	public void addVertex(char v) {
		vertices[numVertices++] = new Vertex(v);
	}
	
	public void addEdge(int start, int end) {
		adjMatrix[start][end] = 1;
		adjMatrix[end][start] = 1;
	}
	
	public void displayVertex(int v) {
		System.out.print(vertices[v].label + " ");
	}
	
	public void dfs() {
		vertices[0].wasVisited = true;
		displayVertex(0);
		stack.push(0);
		while (!stack.isEmpty()) {
			int uv = getAdjUnvisitedVertex(stack.peek());
			if (uv == -1) {
				stack.pop();
			} else {
				vertices[uv].wasVisited = true;
				displayVertex(uv);
				stack.push(uv);
			}
		}
		for (int i = 0; i < numVertices; i++) {
			vertices[i].wasVisited = false;
		}
	}
	
	public int getAdjUnvisitedVertex(int v) {
		for (int i = 0; i < numVertices; i++) {
			if (adjMatrix[v][i] == 1 && vertices[i].wasVisited == false) {
				return i;
			}
		}
		return -1;
	}
}
