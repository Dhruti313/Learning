package MyLearning;

import java.util.Arrays;
import java.util.Scanner;

public class PrefixSame {
    public static String prefix(String strs[] ){
        Arrays.sort(strs);
        String str1 = strs[0];
        String str2 = strs[strs.length - 1];


         for( int i = 0 ; i < strs.length ; i++){
             if(str1.charAt(i)!= str2.charAt(i)){
                 return i==0?"" : str1.substring(0,i);
             }
         }

return str1;

    }
    public static void main(String  args[]){
        String strs[] = {"Flower", "Flow","Flight"};
        System.out.println(prefix(strs));


    }
}

