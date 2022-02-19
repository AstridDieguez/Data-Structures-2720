package CSC2720_Lab7;

public class CSC2720_Lab7 {
	public static void main(String[] args) {
		Graph g = new Graph(5);
		g.addEdge(0, 1);
		g.addEdge(0, 4);
		g.addEdge(0, 3);
		
		g.addEdge(2, 0);
		
		g.addEdge(3, 2);
		
		g.addEdge(4, 3);
		g.addEdge(4, 1);
		g.printGraph();
		System.out.println("\n");
		Graph.printMatrix(Graph.generateAdjMatrix(g.adjacencyList));
	}
}
