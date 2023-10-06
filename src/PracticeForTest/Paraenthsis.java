package PracticeForTest;

import java.util.Stack;

public class Paraenthsis {
    public static void main(String args[]){
       String s = "[this]{is}(invalid))";
       System.out.println(check(s));
    }
    public static boolean check(String s){
        char[]c = s.toCharArray();
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i <c.length ; i++){
            if (c[i] == '(' || c[i] == '{' || c[i] == '[' ||  c[i] == ']'||
                    c[i] == ')' ||  c[i] == '}' ){
                if(c[i] == '{'){
                    st.push(c[i]='}');
                }
                else if (c[i] == '(') {
                    st.push(c[i]=')');
                }
                else if (c[i] == '[') {
                    st.push(c[i]=']');
                } else if (!st.empty() &&st.peek()==c[i]){
                    st.pop();
                }else{
                    return false;
                }
            }
        }
        if(st.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}
