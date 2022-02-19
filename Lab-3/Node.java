// Using same Node class from the Midterm assignment
package CSC2720_Lab3;
// Node class of type contains only three elements
// a value of type T, a prev node and a next node
public class Node<T> {
	T value;
	Node<T> prev = null;
	Node<T> next = null;
	
	public Node(T value) {
		this.value = value;
	}
}
