package packages;
import java.util.Arrays;
// Time and space complexity is directly proportional O(n)
public class RingBuffer<T> {
	// Array of Generic Type T used to store elements
	private T[] queue;
	// front and rear variables store the positions of the beginning and end
	// elements in the ring buffer
	private int front;
	private int rear;
	// max_size is the maximum size of elements that can be held, current_size refers
	// to the current number of elements in the ring buffer.
	private int max_size;
	private int current_size = 0;
	
	public RingBuffer(int size) {
		// Constructor creates an array of Type T, with a capacity of size
		// front and rear variables are initialized to 0 and -1 respectively
		queue = (T[]) new Object[size];
		max_size = size;
		front = 0;
		rear = -1;
	}
	public void add(T value) {
		// if the ring buffer is full, then an overflow message
		// with the overflow value is printed
		if(isFull()) {
			System.out.println("Overflow value: " + value);
		}
		else {
			// The rear is increased to the next value in the ring buffer (rear + 1)
			// and % max_size will set the rear index to the beginning if at the end of the
			// ring buffer. The T value is then placed at this index in the queue, and the
			// current_size is incremented
			rear = (rear + 1) % max_size;
			queue[rear] = value;
			current_size++;
			System.out.println("Added value = " + value);
		}
	}
	public void remove() {
		// if the ring buffer is empty, then an underflow message
		// is printed
		if(isEmpty()) {
			System.out.println("Underflow");
		}
		else {
			// T value is used to print the deleted value
			T value = queue[front];
			// Current front value is set to null
			queue[front] = null;
			// new front value is incremented (++front) and then % max_size
			// will set the front index to the beginning if at the end of the 
			// ring buffer
			// current_size is decremented
			front = ++front % max_size;
			current_size--;
			System.out.println("Deleted value = " + value);
		}
	}
	public boolean isEmpty() {
		// Checks whether the current size is 0 and returns true or false
		// If true, prints out "Buffer is empty"
		if(current_size == 0) {
			System.out.println("Buffer is empty");
			return true;
		}
		return false;
	}
	public boolean isFull() {
		// Checks whether the current size is equal the maximum capacity and
		// return true or false. If true, prints out "Buffer is full"
		if(current_size == max_size) {
			System.out.println("Buffer is full");
			return true;
		}
		return false;
	}
	public void display() {
		// Displays the current ring buffer/queue using a for loop
		// Only displays the current existing items, not the entire ring buffer
		System.out.print("Elements in ring buffer are: ");
		System.out.print("[");
		int index = front;
		for (int i = 0; i < current_size; i++) {
			if(queue[index] != null) {
				if(i == current_size -1) {
					System.out.print(queue[index]);
				}
				else {
					System.out.print(queue[index] + ", ");
				}
			}
			index = (index + 1) % max_size;
		}
		System.out.println("]");
	}
	public void displayAll() {
		// Displays the entire ring buffer, with null values included
		// Optionally can print out he current front and rear values
		System.out.print("Elements in ring buffer are: ");
		System.out.println(Arrays.toString(queue));
		//System.out.println("Front: " + front);
		//System.out.println("Rear: " + rear);
		
	}
	
	

}
