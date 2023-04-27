package OOPS;

import java.io.BufferedReader;
import java.io.FileReader;

public class CopyByLine {
    public static void main(String args[]) throws Exception {
        FileReader f = new FileReader("dhruti.txt");
        BufferedReader br = new BufferedReader(f);

        String str = null;
        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }
        f.close();
    }
}
