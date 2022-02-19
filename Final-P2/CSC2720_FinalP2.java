package CSC2720_Final;

public class CSC2720_FinalP2 {
// Space and time complexity is O(1)
	public static void main(String[] args) {
		HashSet<Integer> h = new HashSet<Integer>();
		h.insert(26);
		h.insert(28);
		h.insert(5);
		
		System.out.println(h.contains(26));
		h.remove(26);
		System.out.println(h.contains(26));
		
	}

}
