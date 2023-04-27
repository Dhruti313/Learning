package OOPS;

import java.io.BufferedReader;
import java.io.FileReader;

public class CountFile {
    public static void main(String args[]) throws Exception{
        String line;
        int count= 0;
        FileReader f = new FileReader("dhruti.txt");
        BufferedReader br = new BufferedReader(f);

        while((line=br.readLine())!= null) {
            String w[] = line.split("");
            count = count + w.length;
        }
        System.out.println(count);
        br.close();
        }
    }

