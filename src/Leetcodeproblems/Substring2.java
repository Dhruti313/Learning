package Leetcodeproblems;

import java.util.HashMap;
import java.util.Stack;

public class Substring2 {
    public static boolean subString_(String s1 , String s2) {

        char ch[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();
int i = 0 ;
 int j =0 ;
 while(i<ch.length && j<ch2.length){
     if(ch[i] == ch2[j]){
         i++;
     }
     else{
         j++;
     }
 }
 if(i == ch.length){
     return true;
 }
 else {
     return false;
    }
    }
    public static void main(String args[]){
        String s1 = "abc";
        String s2 = "aghbj";
        System.out.println(subString_(s1 , s2));
    }
}
