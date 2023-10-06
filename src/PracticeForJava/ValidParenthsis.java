package PracticeForJava;

import java.util.SimpleTimeZone;
import java.util.Stack;

public class ValidParenthsis {
    public static boolean isvalid(String s){
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == '(' || c == '{'){
                stack.push(c);
            } else if (!stack.isEmpty() && c== ')' && stack.peek() == '(' || c== '}' && stack.peek() == '{') {
                stack.pop();
            }
            else{
                return false;
            }

        }
        return stack.isEmpty();
    }
    public static void main(String args[]){
        String s = "[";
        Boolean b = isvalid(s);
        System.out.println(b);
    }
}
