package packages;

public class Node {
	public Integer item;
	public Node next;
	
	public Node(int d){
		item = d;
		next = null;
	}
	public Node(){
		item = null;
		next = null;
	}
}
