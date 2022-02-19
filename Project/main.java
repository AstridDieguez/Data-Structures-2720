import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void rotateArrayLeft(int[] arr, int n) {
		int len = arr.length;

		for (int i = 0; i < n; i++) {
			int temp = arr[0];
			for(int j = 0; j < len; j++) {
				if(j == len - 1) {
					arr[j] = temp;
				}
				else {
					arr[j] = arr[j + 1];
				}
			}
		}
	}
	public static void swap(int [] a, int k) {
		int count = 0;
		int index = 0;
		boolean swap = false;
		
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] <= k && swap) {
				int temp = a[i];
				a[i] = a[index];
				a[index] = temp;
				swap = false;
				count++;
				
				if(a[i] > k) {
					index = i;
					swap = true;
				}
			}
			else if (a[i] > k && !swap){
				index = i;
				swap = true;
			}
		}
		System.out.println("Swaps: " + count);
		System.out.println(Arrays.toString(a));
	}
	public static void removeDup(int [] a, int n) {
		int j = 0;
		for(int i = 0; i < n - 1; i++) {
			if(a[i] != a[i+1]) {
				a[j++] = a[i];
			}
		}
		a[j++] = a[n-1];
		
		for(int i = 0; i < j; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		/*
		int [] a = {2, 1, 5, 6, 3};
		int [] b = {5, 8, 2, 4, 6, 9, 10, 3};
		int [] c = {1, 2, 3, 3, 2, 4, 1, 5, 3}; // c =  {4, 5}
		int [] d = {10, 20, 20, 30, 30, 40, 50, 50}; 
		swap(a, 3);
		swap(b, 5);
		removeDup(c, c.length);
		removeDup(d, d.length);
		*/
		
		int [] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		rotateArrayLeft(a, 3);
		System.out.println();
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

}
