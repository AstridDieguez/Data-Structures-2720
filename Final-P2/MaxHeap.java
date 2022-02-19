package CSC2720_Final;

public class MaxHeap {
	private int [] Heap;
	private int size;
	private int maxSize;
	public MaxHeap(int maxSize){
		this.maxSize = maxSize;
		this.size = 0;
		Heap = new int[this.maxSize];
	}
	private int parent(int pos) {
		return (pos - 1) / 2;
	}
	private int leftChild(int pos) {
		return (2 * pos) + 1;
	}
	private int rightChild(int pos) {
		return (2 * pos) + 2;
	}
	private boolean isLeaf(int pos) {
		if(pos >= (size / 2) && pos <= size) {
			return true;
		}
		return false;
	}
	private void swap(int fpos, int spos) {
		int temp;
		temp = Heap[fpos];
		Heap[fpos] = Heap[spos];
		Heap[spos] = temp;
	}
	private void maxHeapify(int pos) {
		if(isLeaf(pos)) {
			return;
		}
		if(Heap[pos] < Heap[leftChild(pos)] || Heap[pos] < Heap[rightChild(pos)]) {
			if(Heap[leftChild(pos)] > Heap[rightChild(pos)]) {
				swap(pos, leftChild(pos));
				maxHeapify(leftChild(pos));
			} 
			else {
				swap(pos, rightChild(pos));
				maxHeapify(rightChild(pos));
			}
		} // end if
	}
	public void insert(int element) {
		if(size >= maxSize) {
			System.out.println("Heap Max : " + this.maxSize);
			return;
		}
		Heap[size++] = element;
		
		int current = size - 1;
		// While loop makes sure that inserted elements are put in place
		// so that they are always less than parents
		//this.print();
		while(Heap[current] > Heap[parent(current)]) {
			swap(current, parent(current));
			//this.print();
			current = parent(current);
		}
	}
	public int extractMin() {
		int popped = Heap[0];
		Heap[0] = Heap[size - 1];
		size--;
		maxHeapify(0);
		return popped;
	}
	public int size() {
		return size;
	}
	public void print() {
		System.out.print("[");
		for(int i = 0; i < size - 1; i++) {
			System.out.print(Heap[i] + ", ");
		}
		if(size > 0)
			System.out.print(Heap[size - 1]);
		System.out.println("]");
	}
	public void printTree() {
		double exp = 0;
		double a = 0; // max size for each line
		double b = 0; // counter
		int line = 0;
		String spaces = "               ";
		
		for(int i = 0; i < Heap.length; i++) {
			if(line == 0) {
				System.out.print(spaces);
				spaces = spaces.substring(0, spaces.length() - 2);
			}
			// Print value
			System.out.print(Heap[i] + " ");
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
}
