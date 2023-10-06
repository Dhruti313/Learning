package Cdac;

import java.util.Stack;

public class Paranthesis {
    public static boolean collect(String s){
        Stack<String> st = new Stack<>();
        char c[] = s.toCharArray();

        for(int i = 0 ; i <c.length ; i++){
            if(c == "{".toCharArray()){
                st.push("{");
            } else if (c=="(".toCharArray()) {
                st.push("(");
            } else if (c=="[".toCharArray()) {
                st.push("[");
            } else if (c=="]".toCharArray() || (c=="}".toCharArray()) || (c==")".toCharArray())) {
                st.pop();
            }

        }
        if(st == null){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String args[]){
        String s = "{([])}";
        System.out.println(collect(s));
    }
}
