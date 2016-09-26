package com.dsa.graphs;

public class GraphMSTW {
	private final int MAX_VERTS = 20;
	//private final int INFINITY = 1000000;
	private int[][] adjMatrix;
	private Vertex[] vertices;
	private int numOfVertices;
	private int currentVertex;
	private PriorityQueueG queue;
	private int numVInTree;
	
	public GraphMSTW() {
		vertices = new Vertex[MAX_VERTS];
		adjMatrix = new int[MAX_VERTS][MAX_VERTS];
		queue = new PriorityQueueG();
	}
	
	public void addVertex(char label) {
		vertices[numOfVertices++] = new Vertex(label);
	}
	
	public void addEdge(int src, int dest, int weight) {
		adjMatrix[src][dest] = weight;
		adjMatrix[dest][src] = weight;
	}
	
	public void displayVertex(int v) {
		System.out.print(vertices[v].label + " ");
	}
	
	public void mstw() {
		currentVertex = 0;
		while (numVInTree < numOfVertices - 1) {
			numVInTree++;
			vertices[currentVertex].isInTree = true;
			
			for (int i = 0; i < numOfVertices; i++) {
				if (i == currentVertex)
					continue;
				if (vertices[i].isInTree == true)
					continue;
				int distance = adjMatrix[currentVertex][i];
				if (distance == 0)
					continue;
				putInQueue(i, distance);
			}
			
			if (queue.isEmpty()) {
				return;
			}
			Edge minDistE = queue.removeMin();
			int srcVertex = minDistE.srcVertex;
			currentVertex = minDistE.destVertex;
			
			System.out.print(vertices[srcVertex].label);
			System.out.print(vertices[currentVertex].label);
			System.out.print(" ");
		}
		
		for (int i = 0; i < numOfVertices; i++) {
			vertices[i].isInTree = false;
		}
	}
	
	public void putInQueue(int newVert, int newDist) {
		int index = queue.find(newVert);
		if (index == -1) {
			Edge newEdge = new Edge(currentVertex, newVert, newDist);
			queue.insert(newEdge);
		} else {
			Edge existing = queue.peekN(index);
			if (existing.distance > newDist) {
				queue.removeN(index);
				Edge newEdge = new Edge(currentVertex, newVert, newDist);
				queue.insert(newEdge);
			}
		}
	}
}
