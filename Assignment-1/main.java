import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void printMatrix(int [][] a) {
		// prints out the value of a single matrix
		// uses toString method from Arrays class
		for(int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
		System.out.println();
	}
	public static void dotProduct(int [][] a, int [][] b, int len)
	{
		// initialize new product matrix to hold product values
		int [][] product = new int[len][len];
		
		// Nested for loops calculate the product of matrices a and b
		// and stores values in product
		for(int i = 0; i < len; i++) {
			for(int j = 0; j < len; j++) {
				int sum = 0;
				for(int k = 0; k < len; k++) {
					sum += a[i][k] * b[k][j];
				}
				product[i][j] = sum; 
			}
		}
		// prints out the product matrix
		System.out.println("Result matrix is as follows: ");
		printMatrix(product);
	}

	public static void main(String[] args) {
		// User input variable to repeat
		String repeat = null;
		
		do {
		// input variable gets the matrix dimension
		int input = 0;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("What is the matrix dimension? ");
			input = scanner.nextInt();
			
		}while(input != 50);
		// Use scanner to get input, and loop until user inputs 50
		// get current time to get duration of exection
		long startTime = System.currentTimeMillis();
		
		// Create two 2D arrays and randomly generate values
		// from 1-50 using nested for loop
		int [][] a = new int[input][input];
		int [][] b = new int[input][input];
		
		for(int i = 0; i < input; i++) {
			for(int j = 0; j < input; j++) {
				a[i][j] = (int)(Math.random() * 50) + 1;
				b[i][j] = (int)(Math.random() * 50) + 1;
			}
		}
		
		// Print out the values of the randomly
		// generated matrices
		System.out.println("Matrix 1 is as follows: ");
		printMatrix(a);
		System.out.println("Matrix 2 is as follows: ");
		printMatrix(b);

		// call dotProduct method to multiply two matrices of size input
		dotProduct(a, b, input);
		
		// record current time to get duration of execution
		long endTime = System.currentTimeMillis();
		// subtract start and end times to get duration in milliseconds
		long duration = (endTime - startTime);
		System.out.println("Execution time is... " + duration + " ms");
		// prompt user to repeat
		System.out.println("Would you like to try again? ");
		repeat = scanner.next();
		
		}while(repeat.equalsIgnoreCase("yes"));

	}

}
