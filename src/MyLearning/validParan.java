package MyLearning;

import java.util.Stack;

public class validParan {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else {
                return false; // Invalid character or unbalanced brackets
            }
        }

        return stack.isEmpty(); // The stack should be empty if brackets are balanced
    }

    public static void main(String[] args) {
        String input = "([{}])";
        boolean result = isValid(input);
        System.out.println(result);
    }
}
