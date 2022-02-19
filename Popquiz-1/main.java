import packages.*;

public class Main {
	public static void sortLinkedList(Node head) {
		// Bubble sort implementation
		boolean inOrder = false;
		
		while(!inOrder) {
			int swaps = 0;
			for(Node cur = head; cur.next != null; cur = cur.next) {
				if(cur.item > cur.next.item) {
					// Swap
					int temp = cur.next.item;
					cur.next.item = cur.item;
					cur.item = temp;
					swaps++;
				}
			} // end for
			if(swaps == 0) {
				inOrder = true;
			}
		} // end while
	}
	public static void printLinkedList(Node head) {
		for(Node cur = head; cur != null; cur = cur.next) {
			System.out.print(cur.item + " ");
		}
		System.out.println("\n");
	}
	public static Node getUnique(Node head) {
		sortLinkedList(head);
		Node new_head = new Node();
		Node p = new_head;
		int count = 0;
		for(Node cur = head; cur != null; cur = cur.next) {
			if(cur.item != p.item) {
				if(count == 0) {
					p.item = cur.item;
				} else {
					p.next = new Node();
					p.next.item = cur.item;
					p = p.next;
				}
				count++;
			}
		}
		return new_head;
	}
	public static void main(String[] args) {
		System.out.println("Pop Quiz Programming");
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(1);
		head.next.next.next.next = new Node(2);
		
		printLinkedList(head);
		head = getUnique(head);
		printLinkedList(head);
		
	}

}
