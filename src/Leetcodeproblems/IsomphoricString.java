package Leetcodeproblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class IsomphoricString {
    public static boolean string(String s1 , String  s2){
//        Stack<Character> s = new Stack<>();
        HashMap<Character , Character> map =new HashMap<>();
        char c1[] = s1.toCharArray();
        char c2[] = s2.toCharArray();
            for(int i = 0 ; i <c1.length ; i++){
                if(map.containsKey(c1[i])){
                   if(map.get(c1[i])!=(c2[i])){
                       return false;
                   }
                }
                else{
                    if(map.containsValue(c2[i])){
                        return false;
                    }
                    else{
                        map.put(c1[i] , c2[i]);
                    }
                }
            }
        for(Map.Entry<Character, Character> res : map.entrySet()) {
            System.out.println(res.getKey() + "-->" +res.getValue());
        }
        return true;
    }
    public static void main(String args[]){
        String s1= "add";
        String s2 = "ogp";
        System.out.println(string(s1 , s2));
    }
}
