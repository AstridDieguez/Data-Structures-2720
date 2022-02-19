package CSC2720_Final;
import java.util.Arrays;
// Space and time complexity is O(n)
public class CSC2720_FinalP1 {
	// This function prints out the Heap array as a "tree"
	public static void printTree(int [] arr) {
		double exp = 0;
		double a = 0; // max size for each line
		double b = 0; // counter
		int line = 0;
		String spaces = "               ";
		
		for(int i = 0; i < arr.length; i++) {
			if(line == 0) {
				System.out.print(spaces);
				spaces = spaces.substring(0, spaces.length() - 2);
			}
			// Print value
			System.out.print(arr[i] + " ");
			if (b == a) {
				b = 0;
				System.out.println();
				System.out.print(spaces);
				spaces = spaces.substring(0, spaces.length() - 2);
				line++;
				a = Math.pow(2, ++exp);
			}
			b++;
		} // end for
		System.out.println();
	}
	// 1st solution with class data structures
	public static MaxHeap min_to_max(MinHeap min) {
		// Get size of minHeap
		int size = min.size();
		// Declare new maxHeap
		MaxHeap max = new MaxHeap(size);
		// Iterate through minHeap and extract min to insert in max heap
		for(int i = 0; i < size; i++) {
			max.insert(min.extractMin());
		}
		return max;
	}
	// 2nd solution with only heapify function and array, no class data structures
	public static void maxHeapify(int [] min, int i, int len) {
		
		// Define left and right child indexes
		int leftIndex = (2 * i) + 1;
		int rightIndex = (2 * i) + 2;
		int maxIndex = i;
		// Check if left child is greater than the parent
		if(leftIndex < len && min[leftIndex] > min[maxIndex]) {
			maxIndex = leftIndex;
		}
		// Check if the right child is greater than the current maxIndex
		if(rightIndex < len && min[rightIndex] > min[maxIndex]) {
			maxIndex = rightIndex;
		}
		// Switch maxIndex value with parent value
		if(maxIndex != i) {
			int temp = min[i];
			min[i] = min[maxIndex];
			min[maxIndex] = temp;
			// Recursive call to child
			maxHeapify(min, maxIndex, len);
		}
	}
	public static void maxHeapifyCall(int [] min) {
		// Iterates through each parent node, length / 2
		for(int i = (min.length / 2) - 1; i >= 0; i--) {
			maxHeapify(min, i, min.length);
		}
	}
	public static void main(String[] args) {
		MinHeap min = new MinHeap(10);
		int [] arr = {3, 5, 9, 6, 8, 20, 10, 12, 18, 9};
		for(int i = 0; i < 10; i++) {
			min.insert(arr[i]);
		}
		// 1st solution
		System.out.println("MinHeap: ");
		min.print();
		min.printTree();
		
		MaxHeap max = min_to_max(min);
		System.out.println("MinHeap to MaxHeap: ");
		max.print();
		max.printTree();
		
		// 2nd solution
		System.out.println("Before maxHeapifyCall: ");
		System.out.println(Arrays.toString(arr));
		printTree(arr);
		maxHeapifyCall(arr);
		System.out.println("After maxHeapifyCall: ");
		System.out.println(Arrays.toString(arr));
		printTree(arr);
	}
}
