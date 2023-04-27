package OOPS;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Fh2  {
    public static void main(String args[]) throws IOException{
        FileReader fr = new FileReader("dac1.txt");
        BufferedReader br1 = new BufferedReader(fr);
        int ch;
        while((ch=fr.read())!= -1){
            System.out.print((char)ch);
        }
        String s = null;
        while((s = br1.readLine()) !=null);
        {
            System.out.println(s);
        }
        fr.close();
    }
}
