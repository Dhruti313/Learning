package Leetcodeproblems;

import java.util.Stack;

public class RemoveDuplicateString {
    public static String removeDuplicates(String s){
        Stack<Character> str = new Stack<>();
        for(int  i = 0 ; i<s.length() ; i++){
            if(str.isEmpty()){
                str.push(s.charAt(i));
            } else if (str.peek() == s.charAt(i)) {
                str.pop();
            }
            else{
                str.push(s.charAt(i));
            }
        }
        String cointainElem="";
        while(!str.isEmpty()){
            cointainElem = str.pop()+cointainElem;

        }
    return cointainElem;
    }
    public static void main(String args[]){
        String s = "abbaca";
        System.out.println(removeDuplicates(s));




    }
}
