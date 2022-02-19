package CSC2720_Lab6;
import java.util.Arrays;

public class CSC2720_Lab6 {
	public static void sort(int [] arr) {
		// Bubble sort implementation
		boolean inOrder = false;
		
		while(!inOrder) {
			int swaps = 0;
			for(int i = 0; i < arr.length - 1; i++) {
				if(arr[i] > arr[i + 1]) {
					// Swap
					int temp = arr[i + 1];
					arr[i + 1] = arr[i];
					arr[i] = temp;
					swaps++;
				}
			} // end for
			System.out.println("             " + Arrays.toString(arr));
			if(swaps == 0) {
				inOrder = true;
			}
		} // end while
	}
	public static void quickSort(int [] arr, int l, int r) {
		// Quick sort implementation
		// Error checkpoint
		if(arr.length == 1) {
			return;
		}
		// Define pivot pointer, beginning and end pointers
		int pivot = r;
		int begin = l;
		int end = r;
		
		// Partition
		while(l < r) {
			while(arr[l] <= arr[pivot] && l < r) {
				l++;
			}
			while(arr[r] >= arr[pivot] && r > l) {
				r--;
			}
			
			if(l != r) {
				// Swap
				int temp = arr[r];
				arr[r] = arr[l];
				arr[l] = temp;
			}
			
			System.out.println("             " + Arrays.toString(arr) + "   l = " + l + ", r = " + r + ", begin = " + begin + ", pivot = " + pivot);
		} // end while
		
		// Left and right pointers are equal at this point
		// If they are at the end, do not swap unnecessarily
		// If they are at the end then this part of the array
		// is already partitioned
		if(l != end) {
			// Swap left or right pointer with pivot, doesn't matter which
			// This will put the pivot in the correct
			// place so that all the numbers after it are greater than it
			int temp = arr[pivot];
			arr[pivot] = arr[l];
			arr[l] = temp;
			
			// Increment left pointer
			// Decrement right pointer
			// for next partition
			if(l != begin) {
				l++;
				r--;
			}
			else {
				// left pointer is at the beginning
				// lower half will not be sorted
				l++;
			}
		}
		else {
			// left pointer is at the end
			// Decrement right pointer to 
			// prepare for the next partition
			// Left pointer will be equal to end here
			// so upper half will not be sorted
			r--;
		}
		//System.out.println(Arrays.toString(arr));
		
		// Sort lower half
		if(r != begin) {
			quickSort(arr, begin, r);
		}
		// Sort upper half
		if(l != end) {
			quickSort(arr, l, end);
		}
	}
	public static void main(String[] args) {
		/*
		int [] arr = new int[6];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 3); 
		}
		*/
		
		int [] arr = {54, 26, 93, 17, 77, 31, 44, 55, 20};
		
		System.out.print("Array:       ");
		System.out.println(Arrays.toString(arr) + "\n");
		
		quickSort(arr, 0, arr.length - 1);
		System.out.print("\nQuick sort:  ");
		System.out.println(Arrays.toString(arr));
		
		/*
		sort(arr);
		System.out.print("\nBubble sort: ");
		System.out.println(Arrays.toString(arr));
		*/
		
	}

}
