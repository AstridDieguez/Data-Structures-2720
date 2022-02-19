package CSC2720_Lab5;
import java.util.HashSet;

public class findSum {
	public static HashSet<Integer> findSums(int[] elements){
		
		HashSet<Integer> sums = new HashSet<Integer>();
		
		for(int i = 0; i < elements.length; i++) {
			int a = elements[i];
			for(int j = i + 1; j < elements.length; j++) {
				int b = elements[j];
				int sum = a + b;
				if(!sums.contains(sum)) {
					for(int k = 0; k < elements.length; k++) {
						if(sum == elements[k]) {
							sums.add(sum);
							break;
						} 
					} // end k
				} // end if
			} // end j
		} // end i
	
		return sums;
	}
	public static void main(String[] args) {

		int [] arr = {1, 5, 4, 6, 7, 9};
		HashSet<Integer> sums = findSums(arr);
		
		System.out.println(sums.toString());
		
		
		
		

	}

}
