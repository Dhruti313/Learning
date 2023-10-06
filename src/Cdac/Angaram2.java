package Cdac;

import java.util.Arrays;

public class Angaram2 {
    public static boolean copy(){
        String s1 = "abcdef";
        String s2 = "fecdba";


        char[] ch = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch2);
        System.out.println(ch);
        System.out.println(ch2);


        if(s1.length() != s2.length()){
           return false;

        }
        else{
            for(int i = 0 ; i <s2.length() ; i++){
                if(ch[i] != ch2[i]){
                    return false;
                }
            }
            return true;

        }

    }
    public static void main(String args[]){

        System.out.println(copy());
    }
}
