import java.util.HashSet;
import java.util.Arrays;

public class Main {

	public static int solve_with_sort(int[] arr, int k) {
		int counter = 0;
		Arrays.sort(arr);
		Integer left = 0;
		Integer right = 0;
		
		while(right < arr.length) {
			
			int diff = arr[right] - arr[left];
			
			if(diff == k) {
				counter++;
				left++;
				right++;
			} 
			else if(diff > k) {
				left++;
			} 
			else if(diff < k) {
				right++;
			}
		}
		
		return counter;
	}
	public static int solve_with_hash(int[] arr, int k) {
		int counter = 0;
		HashSet<Integer> hash = new HashSet<Integer>();
		
		for(int i = 0; i < arr.length; i++) {
			hash.add(arr[i]);
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(hash.contains(arr[i] + k)) {
				counter++;
			}
			if(hash.contains(arr[i] - k)) {
				counter++;
			}
			// Avoid repetitive comparisons
			hash.remove(arr[i]);
		}
		
		return counter;
	}
	public static void main(String[] args) {
			
		int [] arr = {1, 5, 3, 4, 2};
		int k = 3;
		long start = System.currentTimeMillis();
		
		System.out.println("Solve with sort: " + solve_with_sort(arr, k));
		System.out.println("Total execution time: " + (System.currentTimeMillis() - start) + " ms");
		
		start = System.currentTimeMillis();
		System.out.println("Solve with hash: " + solve_with_hash(arr, k));
		System.out.println("Total execution time: " + (System.currentTimeMillis() - start) + " ms");

	}

}
