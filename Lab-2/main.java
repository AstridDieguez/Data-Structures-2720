import java.util.Stack;
import java.util.EmptyStackException;
public class Main {
	public static boolean backspaceCompare(String s1, String s2) {
		Stack<Character> stack1 = new Stack<Character>();
		Stack<Character> stack2 = new Stack<Character>();
		
		for(int i = 0; i < s1.length(); i++) {
			// First String
			if(s1.charAt(i) == '#') {
				try {
					stack1.pop();
				}
				catch(EmptyStackException e) {
					System.out.println(e);
					break;
				}
			}
			else {
				stack1.push(s1.charAt(i));
			}
			// Second String
			if(s2.charAt(i) == '#') {
				try {
					stack2.pop();
				}
				catch(EmptyStackException e) {
					System.out.println(e);
					break;
				}
			}
			else {
				stack2.push(s2.charAt(i));
			}
		}
		
		if(stack1.equals(stack2)) {
			return true;
		}
		
		return false;
	}

	public static void main(String[] args) {
		String s1 = "DataStructuresIssss###Fun";
		String s2 = "DataStructuresIszwp###Fun";
		boolean ans = backspaceCompare(s1, s2);
		System.out.println(ans);
		
	}

}
