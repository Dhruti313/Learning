package OOPS;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileCOuntLineWord {
    public static void main(String args[]) throws Exception{
        int charCount = 0 ;
        int wordCount = 0 ;
        int lineCount = 0 ;
try{
        FileReader f = new FileReader("D:\\cdac folder\\dhruti1.txt");
        BufferedReader br = new BufferedReader(f);
        String currline = br.readLine();

        while(currline !=null) {
            lineCount++;

            String w[] = currline.split("");
            wordCount = wordCount + w.length;

            for (String words : w) {
                charCount = charCount + w.length;
            }
            currline = br.readLine();
        }

    System.out.println(charCount);
    System.out.println(wordCount);
    System.out.println(lineCount);
        }catch (Exception e){
    System.out.println("error occurred");
        }

    }
}
