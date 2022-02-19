package CSC2720_PopQuiz1;

public class Node {
	Integer item;
	Node next;
	
	Node(int d){
		item = d;
		next = null;
	}
	Node(){
		item = null;
		next = null;
	}
}
