package CSC2720_Assignment2;

public class MyStack<T> {
	
	private int max_size;
	private T [] stack;
	private int curr = -1;
	
	public MyStack(int max_size) {
		this.max_size = max_size;
		stack = (T[]) new Object[this.max_size];
	}
	public MyStack() {
		this.max_size = 255;
		stack = (T[]) new Object[this.max_size];
	}
	public void push(T value) {
		stack[++curr] = value;
	}
	public T pop() {
		T value = stack[curr];
		stack[curr--] = null;
		return value;
	}
	public T peek() {
		return stack[curr];
	}
	public Integer getMin() {
		if(curr < 0){
			return null;
		}
		else if(curr == 0) {
			return (Integer)stack[curr];
		}
		Integer min = (Integer)stack[0];
		for(int i = 1; i <= curr; i++) {
			if((Integer)stack[i] < min) {
				min = (Integer)stack[i];
			}
		}
		return min;
	}
	public void print() {
		System.out.println(this.toString());
	}
	public String toString() {
		String s = "";
		s += "[";
		for(int i = 0; i < curr; i++) {
			s += stack[i] + ", ";
		}
		s += stack[curr] + "]";
		return s;
	}
	
}
