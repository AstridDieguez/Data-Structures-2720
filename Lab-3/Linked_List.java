// Using same Linked_List class from the Midterm assignment
// Edited: Removed size variable
package CSC2720_Lab3;
// Space and time complexity is directly proportional O(n)
public class Linked_List<T> {
	// head and nail are nodes that refer to the beginning and end of the linked list
	// they hold a null value, but serve to point to the next or previous element
	Node<T> head;
	Node<T> last;
	
	public Linked_List(){
		// head and tail are initialized with a null value
		head = new Node<T>(null);
		last = new Node<T>(null);
		// since the list is empty, head and tail nodes refer back to each other
		head.next = last;
		last.prev = head;
	}
	public void add(T value) {
		if(value != null) {
			// Default new Node is added first, so the most recently added element
			// is the head element
			// Create new node with T value as an argument
			Node<T> newNode = new Node<T>(value);
			// Set the new node previous node to head
			// Set the new node's next node to the head's previous next node
			newNode.prev = head;
			newNode.next = head.next;
			// Set the head's previous next node's previous node to the new node
			// Set the head's next node to the new node
			head.next.prev = newNode;
			head.next = newNode;
		}
	}
	public void remove() {
		// Default removal removes the head element
		// Set the head's next node to the next's next node
		// Set the head's next node's previous node to the head
		System.out.println("Removed value = " + head.next.value);
		head.next = head.next.next;
		head.next.prev = head;
	}
	public void addLast(T value) {
		// Add T value to the end of the linked list
		if(value != null) {
			// Create new node with T value as argument
			Node<T> newNode = new Node<T>(value);
			// Set new node's next node to tail node
			// Set new node's previous node to tail's previous node
			newNode.next = last;
			newNode.prev = last.prev;
			// Set tail's previous node's next node to new node
			// Set tail's previous node to new node
			last.prev.next = newNode;
			last.prev = newNode;
		}
	}
	public void removeLast() {
		// Removes element at the end of the linked list
		// Set tail's previous node to tail's previous' previous' node
		// Set tail's previous' node's next node to tail node
		System.out.println("Removed value = " + last.prev.value);
		last.prev = last.prev.prev;
		last.prev.next = last;
	}
	public T peekFirst() {
		return head.next.value;
	}
	public T peekLast() {
		return last.prev.value;
	}
	public void display() {
		// Displays the current linked list. Starts with the head's next node
		// and prints it's value, then gets that node's next node and repeats
		// until size - 1 is reached
		/*
		System.out.print("[");
		Node<T> node = head.next;
		for(int i = 0; i < size - 1; i++) {
			System.out.print(node.value + ", ");
			node = node.next;
		}
		System.out.println(node.value + "]");
		*/
		System.out.print("[");
		Node<T> node = head.next;
		while(node.next.value != null) {
			System.out.print(node.value + ", ");
			node = node.next;
		}
		System.out.println(node.value + "]");
	}
}
