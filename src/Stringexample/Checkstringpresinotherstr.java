package Stringexample;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Checkstringpresinotherstr {
    public static void main(String args[]){
        String str = "geeksforgeeks";
        String pat = "e";
        int minIndex = Integer.MAX_VALUE ;

        HashMap<Character, Integer> map = new LinkedHashMap<>();

        for(int i = 0 ; i <str.length() ; i++){
            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i) , i);

            }

        }
        for(int i = 0 ; i<pat.length() ; i++){
            if(map.containsKey(pat.charAt(i))&& (map.get(pat.charAt(i)) <minIndex)){
                minIndex = map.get(pat.charAt(i));

            }
            if(minIndex!=Integer.MAX_VALUE){
                System.out.println(str.charAt(minIndex));
            }
            else{
                System.out.println("no char matches");
            }
        }
       // System.out.println(minIndex);
    }
}
