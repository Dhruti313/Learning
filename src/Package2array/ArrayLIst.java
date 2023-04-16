package Package2array;
import java.util.*;
public class ArrayLIst {
    public static void main(String args[]){
        List s = Arrays.asList("Cdac", "Banglore", "ecity");
        System.out.println(s);

        List<String> list = new ArrayList<String>(s);
        System.out.println(list);
        String string = String.join("/" ,list);
        System.out.println(string);


    }
}
