package OOPS;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Scanner;

public class FileExample {
    public static void Data(File f1 , File f2) throws Exception{
        FileInputStream fs = new FileInputStream(f1);
        FileOutputStream fo = new FileOutputStream(f2);
        System.out.println(fs +" "+fo);
        try{
        int i ;
        while((i =fs.read())!=-1){
            fo.write(i);
        }
        }
        catch (Exception e){
            System.out.println("error found");
        }
        fs.close();
        System.out.println("file copied");
    }
    public static void main(String args[]) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name from where data would be copied");
        String f1 = sc.nextLine();

        File a = new File("D:\\cdac folder\\" +f1);

        System.out.println("enter the file were data would be written");
        String f2 = sc.nextLine();
        File b = new File("D:\\cdac folder\\"+f2);

        Data(a,b);
        sc.close();


    }
}

