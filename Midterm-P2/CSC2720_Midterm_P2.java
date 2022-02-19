package CSC2720_Midterm;

public class CSC2720_Midterm_P2 {

	public static void main(String[] args) {
		Linked_List<Integer> test = new Linked_List<Integer>();
		test.add(25);
		test.add(8);
		test.add(39);
		test.add(41);
		test.add(15);
		test.display();
		System.out.println("Current head: " + test.peekFirst());
		test.remove();
		test.display();
		System.out.println("Current head: " + test.peekFirst());
		

	}

}
