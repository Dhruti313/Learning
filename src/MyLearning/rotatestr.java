package MyLearning;
import java.util.*;


public class rotatestr {
    public static boolean rotate(String str , String goal){

        return(str.length() == goal.length() && (str+str).contains(goal));

    }
    public static void main(String args[]){
        String str = "abcde";
        String goal = "cdeab";

        boolean h = rotate(str , goal);
        System.out.println(h);


    }

}
