package Arraylistandpractise;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class F1 {
    public static void main(String args[]) throws IOException {
        FileWriter fw = new FileWriter("D:\\cdac folder\\core java cdac pdf\\dhrutifile1.txt");
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);

        String str = br.readLine();


        fw.write(str);
        System.out.println("file write over");
        fw.close();
    }
}
