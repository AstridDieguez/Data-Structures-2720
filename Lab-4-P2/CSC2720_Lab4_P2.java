package CSC2720_Lab4P2;

public class CSC2720_Lab4P2 {

	public static void main(String[] args) {	
		BinarySearchTree tree1 = new BinarySearchTree();
		
		tree1.insert(50);
		tree1.insert(30);
		tree1.insert(70);
		tree1.insert(20);
		tree1.insert(40);
		tree1.insert(60);
		tree1.insert(80);
		
		System.out.println("3rd largest node: " + (tree1.kthLargestUtil(tree1.root, 3, new Count())).data);
		System.out.print("1st largest node: ");
		tree1.kthLargest(0);
		
		
		

	}

}
