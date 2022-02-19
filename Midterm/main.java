import packages.*;

public class Main {

	public static void main(String[] args) {
		
		RingBuffer<Integer> test = new RingBuffer<Integer>(5);
		test.add(1);
		test.add(2);
		test.add(3);
		test.add(4);
		test.display();
		test.remove();
		test.remove();
		test.display();
		test.add(9);
		test.add(20);
		test.add(5);
		test.display();
		test.isFull();
	}

}
