package Arraylistandpractise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class F2 {
    public static void main(String args[]) throws IOException {
        FileReader fr = new FileReader("D:\\cdac folder\\dhruti1.txt");
        BufferedReader br = new BufferedReader(fr);
        String st1 = null;
        while ((st1=br.readLine())!=null){
            System.out.println(st1);

        }
        fr.close();
    }
}
