import packages.*;
public class TreeTraversal {
	
	public static void main(String[] args){
		// Create a tree called tree1 
		BinaryTree<Character> tree1 = new BinaryTree<Character>('H');
		
		BinaryTree<Character> rightsubtree1 = new BinaryTree<Character>('X');   
		rightsubtree1.attachRight('Y');     
		
		BinaryTree<Character> leftsubtree1 = new BinaryTree<Character>('D');  
		leftsubtree1.attachLeft('B');      
		
		BinaryTree<Character> leftsubtree2 = new BinaryTree<Character>('F');  
		leftsubtree2.attachRight('G');     
		leftsubtree2.attachLeft('E');      
		
		leftsubtree1.attachRightSubtree(leftsubtree2);
		tree1.attachLeftSubtree(leftsubtree1);
		tree1.attachRightSubtree(rightsubtree1);
				

		BinaryTree<Character> tree2 = new BinaryTree<Character>('F');
		
		BinaryTree<Character> subtree1 = new BinaryTree<Character>('B');
		subtree1.attachLeft('A');
		
		BinaryTree<Character> subtree2 = new BinaryTree<Character>('D');
		subtree2.attachLeft('C');
		subtree2.attachRight('E');
		
		BinaryTree<Character> subtree3 = new BinaryTree<Character>('G');
		
		BinaryTree<Character> subtree4 = new BinaryTree<Character>('I');
		subtree4.attachLeft('H');
		
		subtree1.attachRightSubtree(subtree2);
		subtree3.attachRightSubtree(subtree4);
		
		tree2.attachLeftSubtree(subtree1);
		tree2.attachRightSubtree(subtree3);
		
		System.out.println(checkSkipped(tree1)); // Should return true
		System.out.println(checkSkipped(tree2)); // Should return false
		
	}
	
	public static boolean checkSkipped(BinaryTree<Character> tree){
	/*	//   To Iterate a tree using Inorder Traversal
		TreeIterator<Character> iter = new TreeIterator<Character>(tree);
		iter.setInorder();
		while (iter.hasNext()){
			System.out.print (iter.next());
		}
 	*/		
		TreeIterator<Character> iter = new TreeIterator<Character>(tree);
		iter.setInorder();
		
		boolean skipped = false;
		Character item = iter.next();
		int index = (int)(item);
		System.out.print(item);
		
		if(!iter.hasNext()) {
			return true;
		}
		
		while(iter.hasNext()) {
			item = iter.next();
			if((int)item != index + 1 && skipped == false) {
				skipped = true;
			}
			index = (int)item;
			System.out.print(item);
		}
		System.out.println();
		// INSERT CODE HERE
		return skipped;
	}

}
