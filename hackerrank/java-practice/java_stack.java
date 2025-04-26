import java.util.*;

class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			System.out.println(isBalanced(sc.next()));
		}
        sc.close();
		
	}
    
    private static boolean isBalanced(String input) {
    Stack<Character> stack = new Stack<Character>();
    for (int i = 0; i < input.length(); i++) {
        char ch = input.charAt(i);
        if (ch == '(' || ch == '[' || ch == '{') {
            stack.push(ch);
        } else if (stack.empty()) {
            return false;
        } else {
            char top = stack.pop();
            if ((top == '(' && ch != ')') || (top == '[' && ch != ']')
                    || (top == '{' && ch != '}')) {
                return false;
                }
            }
        }
    return stack.empty();
    }
}

// https://www.hackerrank.com/challenges/java-stack/problem