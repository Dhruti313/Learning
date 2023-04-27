package OOPS;

import java.io.BufferedReader;
import java.io.FileReader;

public class CopyByChar {
    public static void main(String args[]) throws Exception{
        FileReader f = new FileReader("dhruti.txt");
        BufferedReader br = new BufferedReader(f);

        int ch;
        while((ch=f.read()) != -1){
            System.out.print((char) ch);

        }
        f.close();
    }
}
