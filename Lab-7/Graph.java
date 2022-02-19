package packages;
import java.util.LinkedList;

public class Graph {
	public int numVertices;
	public LinkedList<Integer>[] adjacencyList;
	public Graph(int n){
		numVertices = n;
		adjacencyList = new LinkedList[numVertices];
		for(int i = 0; i < numVertices; i++) {
			adjacencyList[i] = new LinkedList<Integer>();
		}
	}
	public void addEdge(Integer src, Integer des) {
		this.adjacencyList[src].add(des);
	}
	public void printGraph() {
		for(int i = 0; i < this.numVertices; i++) {
			System.out.print("" + i + " : ");
			int j = 0;
			for(; j < this.adjacencyList[i].size() - 1; j++) {
				System.out.print(this.adjacencyList[i].get(j));
				System.out.print(" --> ");
			} // end for
			if(j == adjacencyList[i].size() - 1) {
				System.out.println(this.adjacencyList[i].get(j));
			} else {
				System.out.println();
			}
		} // end for
	}
	public static Integer[][] generateAdjMatrix(LinkedList<Integer>[] adjacencyList){
		Integer[][] adjacencyMatrix = new Integer[adjacencyList.length][adjacencyList.length];
		// Set matrix values to 0
		for(int i = 0; i < adjacencyMatrix.length; i++) {
			for(int j = 0; j < adjacencyMatrix[i].length; j++) {
				adjacencyMatrix[i][j] = 0;
			} // end for
		} // end for
		for(int i = 0; i < adjacencyList.length; i++) {
			for(int j = 0; j < adjacencyList[i].size(); j++) {
				adjacencyMatrix[i][adjacencyList[i].get(j)] = 1;
			} // end for
		} // end for
		return adjacencyMatrix;
	}
	public static void printMatrix(Integer[][] matrix) {
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
