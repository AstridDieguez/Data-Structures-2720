package CSC2720_Assignment2;

public class CSC2720_Assignment2 {

	public static void main(String[] args) {
		MyStack<Integer> stack = new MyStack<Integer>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(-2);
		stack.push(5);
		stack.print();
		System.out.println("Min: " + stack.getMin());
	}

}
