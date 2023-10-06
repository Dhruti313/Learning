package Cdac;

import java.util.HashMap;

public class AnarambyHashmap {
    public static boolean anagram(String s1 , String s2){

        char ch[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();
        if (ch.length == ch2.length){
            for(int i = 0 ; i<ch.length ; i++){
                if(!map.containsKey(ch[i])){
                    map.put(ch[i] ,1);
                }
            }
            for(int i = 0 ; i<ch2.length ; i++){
                map.remove(ch2[i]);
            }

        }
        if(map.size() == 0){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String args[]){
        String s1 = "abadef";
        String s2 = "fdmdab";
        System.out.println(anagram(s1 , s2));
    }
}
