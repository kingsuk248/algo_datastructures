package com.dsa.graphs;

public class GraphSP {
	
	private final int MAX_VERTS = 20;
	private final int INFINITY = 100000;
	private Vertex[] vertices;
	private int[][] adjMatrix;
	private int nVerts;
	private int nTree;
	private DistanceParent[] sPath;
	private int currentVertex;
	private int startToCurrent;
	
	public GraphSP() {
		vertices = new Vertex[MAX_VERTS];
		adjMatrix = new int[MAX_VERTS][MAX_VERTS];
		for (int i = 0; i < MAX_VERTS; i++) {
			for (int j = 0; j < MAX_VERTS; j++) {
				adjMatrix[i][j] = INFINITY;
			}
		}
		sPath = new DistanceParent[MAX_VERTS];
	}
	
	public void addVertex(char label) {
		vertices[nVerts++] = new Vertex(label);
	}
	
	public void addEdge(int start, int end, int weight) {
		adjMatrix[start][end] = weight;
	}
	
	public void path() {
		int startTree = 0;
		vertices[startTree].isInTree = true;
		nTree = 1;
		for (int i = 0; i < nVerts; i++) {
			int tempDist = adjMatrix[startTree][i];
			sPath[i] = new DistanceParent(i, tempDist); 
		}
		
		while (nTree < nVerts) {
			int indexMin = getMin();
			int minDistance = sPath[indexMin].distance;
			
			if (minDistance == INFINITY) {
				break;
			} else {
				currentVertex = indexMin;
				startToCurrent = minDistance;
			}
			vertices[currentVertex].isInTree = true;
			nTree++;
			adjustSPath();
		}
		displayPaths();
		nTree = 0;
		for (int i = 0; i < nVerts; i++) {
			vertices[i].isInTree = false;
		}
	}
	
	public int getMin() {
		int minDist = INFINITY;
		int indexMin = 0;
		for (int i = 1; i < nVerts; i++) {
			if (!vertices[i].isInTree && sPath[i].distance < minDist) {
				minDist = sPath[i].distance;
				indexMin = i;
			}
		}
		return indexMin;
	}
	
	public void adjustSPath() {
		int column = 1;
		while (column < nVerts) {
			if (vertices[column].isInTree) {
				column++;
				continue;
			}
			int currentToFringe = adjMatrix[currentVertex][column];
			int startToFringe = startToCurrent + currentToFringe;
			int sPathDist = sPath[column].distance;
			if (startToFringe < sPathDist) {
				sPath[column].parentVertex = currentVertex;
				sPath[column].distance = startToFringe;
			}
			column++;
		}
	}
	
	public void displayPaths() {
		for (int i = 0; i < nVerts; i++) {
			System.out.print(vertices[i].label + "=");
			if (sPath[i].distance == INFINITY) {
				System.out.print("INF");
			} else {
				System.out.print(sPath[i].distance);
			}
			char parent = vertices[sPath[i].parentVertex].label;
			System.out.print("(" + parent + ")  ");
		}
		System.out.println();
	}
}
