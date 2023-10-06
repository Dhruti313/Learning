package Arraylistandpractise;

import java.io.*;

public class FileHandling {
    public static void main(String args[]) throws IOException {
        int charcount = 0 ;
         int wordcount = 0;
         int linecount = 0 ;

//         String path= "D:\\cdac folder\\core java cdac pdf\\file handling file";
        FileReader fw = new FileReader("D:\\cdac folder\\core java cdac pdf\\file handling file\\dhrutifile1.txt");
        BufferedReader br = new BufferedReader(fw);


        String line = br.readLine();
        while (line !=null){
            linecount++;

            String s[] = line.split(" ");
            wordcount = wordcount + s.length;

            for(String e : s ){
                charcount = charcount+e.length();
            }
            line = br.readLine();
        }
        System.out.println("linecount "+linecount);
        System.out.println("wordcount "+wordcount);
        System.out.println("charcount "+charcount);



    }
}
