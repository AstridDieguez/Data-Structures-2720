package packages;

public class BinarySearchTree {
	/* Root of BST */
	public Node root;
	
	/* Constructor */
	public BinarySearchTree() {
		root = null;
	}
	/* Function to insert nodes */
	public void insert(int data) {
		this.root = this.insertRec(this.root, data);
	}
	/* A utility function to insert a new node with given key in BST */
	public Node insertRec(Node node, int data) {
		if(node == null) {
			node = new Node(data);
		}
		else {
			if(data < node.data) {
				node.left = insertRec(node.left, data);
			}
			else if (data > node.data) { 
				node.right = insertRec(node.right, data);
			}
			else {
				/* Node data is already equal to another existing node data */
			}
		}
		return node;
	}
	/* Utility function to find kth largest node in a given tree */
	/* Recursive calls go throughout the Binary Search Tree, transversing in-order */
	/* from right to left, or from highest value to lowest value */
	public Node kthLargestUtil(Node node, int k, Count C) {
		/* Base cases, the second condition is important to */
		/* avoid unnecessary recursive calls */
		Node curr = null;
		/*
		if(node == null || C.c >= k) {
			return;
		}
		*/
		
		if(node.right != null) {
			curr = kthLargestUtil(node.right, k, C);
		}
		/* Check if previous returned node is equal to k */
		if(C.c == k) { 
			return curr;
		}
		/* Add the current node to count */
		C.c++;
		/* Check if this current node is equal to k */
		if(C.c == k) { 
			curr = node;
			return curr;
		}
		
		if(node.left != null) {
			curr = kthLargestUtil(node.left, k, C);
		}
		//System.out.println(C.c);
		return curr;
	}
	/* Method to find the kth largest node in given BST */
	public void kthLargest(int k) {
		Count c = new Count();
		Node node = this.kthLargestUtil(this.root, k, c);
		if(node != null) {
			System.out.println(node.data);
		}else {
			System.out.println("null value");
		}
		
	}
}
