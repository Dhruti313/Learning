package MyLearning;

import java.util.Stack;

public class validParan {
    public static boolean isValid(char[] charArray) {
        Stack<Character> container = new Stack<Character>();

        for (char c : charArray) {
            System.out.println(c);
            if (c == '(' || c == '{' || c == '[') {
                container.push(c);
            }
            else if ( !container.empty() && ((c == ')') && container.peek() == '(' ||
                    (c == '}') && container.peek() == '{' || (c == ']') && container.peek() == '[')) {
                container.pop();

            } else {
                return false;
            }

        }
        return container.isEmpty();

    }
    public static void main(String args[]){


    System.out.println( isValid("([{}])".toCharArray()));




    }
}