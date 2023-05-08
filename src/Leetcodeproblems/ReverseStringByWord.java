package Leetcodeproblems;

import MyLearning.Reverse;

public class ReverseStringByWord {
    public static void main(String args[]){
        String s = "lets do code";
      System.out.println(reverseString(s));
    }
    public static String reverseString(String s) {
        StringBuilder sb = new StringBuilder();
        String[] st = s.split(" ");
        String newstring = " ";


        for(int j = 0 ; j<st.length ; j++){
            for(int i = st[j].length()-1; i>=0;i--){
                sb.append(st[j].charAt(i));
            }
            sb.append(" ");
        }

//        System.out.println(sb);
        return sb.toString().trim();
    }
}


