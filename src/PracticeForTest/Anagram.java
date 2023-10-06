package PracticeForTest;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String args[]){
        String s1 = "abcdef";
        String s2 = "fmnjae";
        System.out.println(check(s1 ,s2));
    }
    public static boolean check(String s1 , String  s2){
        char ch[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();

        HashMap<Character , Integer> map = new HashMap<>();
        if(ch.length == ch2.length){
            for(int i = 0 ; i<ch.length ; i++) {
                if (!map.containsKey(ch[i])) {
                    map.put(ch[i], 1);
                } else {
                    map.put(ch[i], map.get(ch[i]) + 1);
                }
            }
        }
        else{
            return false;
        }
            for(int i = 0 ; i <ch2.length ; i++){
             if(map.containsKey(ch2[i]) && map.get(ch2[i])>0){
                 map.put(ch2[i] , map.get(ch2[i]) - 1);
             }
             else{
                 return false;
             }
            }
            return true;
    }
}
