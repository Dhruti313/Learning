package OOPS;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
public class Filehandling1 {
    public static void main(String  args[]) throws IOException
    {
        FileWriter fw = new FileWriter("dac1.txt");
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);

        String str1 = br.readLine();
        String str2 = br.readLine();
        String str3 = br.readLine();

        fw.write(str1);
        fw.write(str2);
        fw.write(str3);
        System.out.println("file write over");
        fw.close();

    }
}
