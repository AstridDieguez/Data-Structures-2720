import java.util.ArrayList;

public class Main {
	public static void intersect(int [] nums1, int [] nums2) {
		ArrayList<Integer> newList = new ArrayList<Integer>();
		for(int i = 0; i < nums1.length; i++) {
			for(int j = 0; j < nums2.length; j++) {
				if(nums1[i] == nums2[j]) {
					newList.add(nums1[i]);
					break;
				}
			}
		}
		System.out.print(newList.toString() + "\n");
	}
	public static void main(String[] args) {
		int [] nums1 = {1, 2, 3, 4, 5};
		int [] nums2 = {4, 5, 6, 7, 8, 2};
		
		intersect(nums1, nums2);
	}

}
