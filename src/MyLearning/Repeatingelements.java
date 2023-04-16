package MyLearning;

import java.util.HashMap;
import java.util.Map;

public class Repeatingelements {
    public static void main(String args[]) {

        String str= "geeksforgeeks";
        char ch [] = str.toCharArray();

        HashMap<Character , Integer> map = new HashMap<>();

        for(int i = 0 ; i<ch.length ; i++){
            if(map.containsKey(ch[i])){
                map.put(ch[i] , map.get(ch[i] ) +1);
            }
            else{
                map.put(ch[i] , 1);
            }
        }
        for(Map.Entry<Character , Integer> e : map.entrySet()){
            if(e.getValue()!=1){
                System.out.println(e.getKey());
            }
        }
    }
}