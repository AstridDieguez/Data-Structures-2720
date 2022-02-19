import java.util.Stack;

public class Main {
	public static boolean isBalanced(String str) {
		Stack<Character> stack = new Stack<Character>();
		Stack<Character> buff = new Stack<Character>();
		char firstChar = str.charAt(0);
		char secondChar = 0;
		if(firstChar == '}') {
			secondChar = '{';
		}
		else if(firstChar == '{') {
			secondChar = '}';
		}
		stack.push(firstChar);
		for(int i = 1; i < str.length(); i++) {
			if(str.charAt(i) == firstChar) {
				if(!buff.isEmpty()) {
					buff.pop();
				}
				else {
					stack.push(firstChar);
				}
			}
			else if(str.charAt(i) == secondChar) {
				if(stack.isEmpty() && i == str.length() - 1) {
					return false;
				}
				else if (stack.isEmpty() && i < str.length() - 1){
					buff.push(secondChar);
				}
				else {
					stack.pop();
				}
			}
		}
		if(stack.isEmpty() && buff.isEmpty()) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {	
		String str = "{}{{{{}}";
		String str1 = "{{{}}}";
		String str2 = "{}}}}{{{";
		String str3 = "}{{{{{}";
		System.out.println(isBalanced(str));
		System.out.println(isBalanced(str1));
		System.out.println(isBalanced(str2));
		System.out.println(isBalanced(str3));	
	}
}
