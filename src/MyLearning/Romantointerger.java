package MyLearning;

import java.util.HashMap;
import java.util.Scanner;

public class Romantointerger {
    public static int Romantointerger(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int ans = 0 ;


        for( int i = 0 ; i<s.length() ; i++){
            int first = map.get(s.charAt(i));
            int second;

            if(i+1 < s.length()){
                second = map.get(s.charAt(i+1));

                if(first < second){
                     ans += second - first;
                     i++;

                }
                else{
                    ans +=first;

                }
            }
            else{
                ans+=first;

            }

    }
        return ans;


    }


    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the roman number");

        String s = scanner.nextLine();
        int ans = Romantointerger(s);
        System.out.println(ans);



    }
}
