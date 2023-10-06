package PracticeForJava;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String args[]){
        String s = "IIV";
        System.out.println(roman(s));
    }
    public static int roman(String s){
        int sum = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);

        for (int i =0 ; i<s.length() ; i++) {
         if(i ==0){
             sum +=map.get(s.charAt(i));
         } else if (map.get(s.charAt(i-1)) < map.get(s.charAt(i))) {
             sum-=map.get(s.charAt(i));
         }
         else{
             sum+= map.get(s.charAt(i));
         }
        }
        return Math.abs(sum);
    }
}
