package CSC2720_Final;
import java.util.Arrays;

public class HashSet<T> {
	// Array of type T holds data values
	private T [] set;
	// Size of array
	int size;
	public HashSet() {
		// Size is 25 default
		size = 25;
		set = (T[]) new Object[this.size];
	}
	public void insert(T value) {
		// Insert value of type T into set
		// call getKey function and return hash key
		int key = getKey(value);
		// If the key is empty, insert value
		// Else print "collision"
		if(set[key] == null) 
			set[key] = value;
		else
			System.out.println("Collision");
	}
	private int getKey(T value) {
		// returns the value modulus size of the set
		int key = (int)value % size;
		return key;
	}
	public String contains(T value) {
		// returns string value of whether
		// the set contains the key
		int key = getKey(value);
		if(set[key] != null)
			return "true";
		else
			return "Hey, nothing here";
		
	}
	public String remove(T value) {
		// removes the given value from the set
		// key is set to null
		int key = getKey(value);
		if(set[key] != null) {
			set[key] = null;
			return "Removed";
		} else {
			return "Value does not exist";
		}
	}
	public String toString() {
		return Arrays.toString(set);
	}
}
