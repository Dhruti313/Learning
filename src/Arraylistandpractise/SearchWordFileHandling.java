package Arraylistandpractise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.stream.StreamSupport;

public class SearchWordFileHandling {
    public static void main(String args[]) throws IOException {
        FileReader fr = new FileReader("D:\\cdac folder\\core java cdac pdf\\file handling file\\dhrutifile.txt");
        BufferedReader br = new BufferedReader(fr);

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String");
        String s = sc.nextLine();

        String line = br.readLine();
        while(line!= null){
            if(line.contains(s)){
                System.out.println(line);
            }
        }

    }
}
