package packages;
// Using same Node class from the Midterm assignment
// Node class of type contains only three elements
// a value of type T, a prev node and a next node
public class Node<T> {
	public T value;
	public Node<T> prev = null;
	public Node<T> next = null;
	
	public Node(T value) {
		this.value = value;
	}
}
