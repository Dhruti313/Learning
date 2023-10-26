package Leetcodeproblems;

import java.util.HashMap;

public class RansonNotes {
    public static void main(String args[]) {
        String s1 = "aa";
        String s2 = "aab";
        System.out.println(notes(s1, s2));
    }
    public static boolean notes(String s1, String s2) {
    HashMap<Character , Integer> map = new HashMap<>();
    for(int  i = 0 ; i <s2.length() ; i++){
        char ch = s2.charAt(i);
        if(map.containsKey(ch)){
            map.put(ch , map.get(ch) +1);
        }
        else{
            map.put(ch , 1);
        }
    }
    int count = 0 ;
    for(int i = 0; i<s1.length() ; i++){
        char ch = s1.charAt(i);
        if(map.containsKey(ch) && map.get(ch) >0){
            count++;
            map.put(ch , map.get(ch) -1);
        }
    }
    if(count == s1.length()){
        return true;
        }
    return false;
    }
}