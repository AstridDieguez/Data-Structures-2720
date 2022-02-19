import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
	public static boolean checkPalindrome(String s1) {
		Stack<Character> stack = new Stack<Character>();
		Queue<Character> queue = new LinkedList<Character>();
		int len = s1.length();
		for(int i = 0; i < len; i++) {
			stack.push(s1.charAt(i));
		}
		for(int i = 0; i < len; i++) {
			queue.add(stack.pop());
		}
		
		String s2 = "";
		for(int i = 0; i < len; i++) {
			s2 += queue.poll();
		}
		
		if(s1.equalsIgnoreCase(s2)) {
			return true;
		}
		
		return false;
	}
	public static void main(String[] args) {
		// String s1 = "radar";
		String s1 = "";
		try{
			s1 = args[0];
		}catch(Exception e){
			System.out.println("Error: " + e.getMessage());
			return;
		}
		boolean ans = checkPalindrome(s1);
		System.out.println(ans);

	}

}
