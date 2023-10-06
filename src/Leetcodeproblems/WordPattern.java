package Leetcodeproblems;

import java.util.HashMap;

public class WordPattern {
    public static void main(String args[]){
        String str = "dog cat cat fish";
         String pattern = "abba";
         System.out.println(patternKey(str , pattern));
    }
    public static boolean patternKey(String str , String pattern){
        String [] arr= str.split(" ");
        if(pattern.length()!= arr.length){
            return false;
        }
        HashMap<Character , String> map = new HashMap<>();
            for(int i = 0 ; i<pattern.length() ; i++){
                char ch = pattern.charAt(i);
                if(map.containsValue(arr[i]) && !map.containsKey(ch)){
                    return false;
                }
                if(map.containsKey(ch) && !map.get(ch).equals(arr[i])){
                    return false;
                }
                else{
                    map.put(ch , arr[i]);
                }
            }
            return true;
    }
}
