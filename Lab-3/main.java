import packages.Linked_List;
import packages.Node;
public class Main {
	// LAB 3 PART 1 METHOD
	public static <T> void deleteAtIndex(Node<T> head, int index) {
		// Assume that index != 0 && index <= size
		// Find node that is at index by running a for loop until
		// the loop reaches index. Set node to the value of the next
		// node each interation
		Node<T> get = head;
		for(int i = 0; i < index; i++) {
			get = get.next;
		}
		// Assume that get.value != null
		// Set current node's previous node's next node to current node's next node
		// Set current node's next node's previous node to current node's previous node
		get.prev.next = get.next;
		get.next.prev = get.prev;
		// Print removed node's value
		System.out.println("Removed value = " + get.value);
}
	// LAB 3 PART 2 METHOD 
	public static <T> void reverse(Node<T> head) {
		int size = 0;
		// Create node called curr that points to the first element
		Node<T> curr = head.next;
		// Use while loop to get current size of the linked list by
		// looping through the list until curr.value is equal to null
		while(curr.value != null) {
			size++;
			curr = curr.next;
		}
		// Determine the tail node by curr's previous node and
		// set curr to the first element again
		Node<T> tail = curr.prev;
		curr = head.next;
		
		// Use a for loop to iterate size / 2 times, each iteration
		// switch the values of the curr and tail until
		// midpoint is reaached
		for(int i = 0; i < size / 2; i++) {
			T temp = curr.value;
			curr.value = tail.value;
			tail.value = temp;
			
			curr = curr.next;
			tail = tail.prev;
		}
	}
	//public static Node reverse1(Node node) {
		
		// Reverse for single linked list
	
		/*
		Node prev = null;
		Node current = node;
		Node next = null;
		
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return node;
		
		/* 85 15 4 20
		 * 
		 * (1)
		 * next = 15
		 * current.next = null
		 * prev = 85
		 * current = 15
		 *
		 * 
		 * (2)
		 * next = 4
		 * current.next = 85
		 * prev = 15
		 * current = 4
		 * 
		 * (3)
		 * next = 20
		 * current.next = 15
		 * prev = 4
		 * current = 20
		 * 
		 * (4)
		 * next = null
		 * current.next = 4
		 * prev = 20
		 * current = null
		 */
		
	//}

	public static void main(String[] args) {
		Linked_List<Integer> list  = new Linked_List<Integer>();
		System.out.println("Lab 3 Part 1: ");
		list.add(12);
		list.add(8);
		list.add(13);
		list.add(24);
		list.add(2);
		list.add(11);
		list.display();
		deleteAtIndex(list.head, 3);
		list.display();
		
		System.out.println("\nLab 3 Part 2: ");
		list.display();
		reverse(list.head);
		System.out.println("Reversed list: ");
		list.display();

	}

}
