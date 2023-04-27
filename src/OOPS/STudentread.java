package OOPS;

import java.io.*;

public class STudentread {
    public static void main(String args[]) throws IOException, ClassNotFoundException {
        FileInputStream is = new FileInputStream("dhruti");
        ObjectInputStream os = new ObjectInputStream(is);

        Stud s;
        try {

            while ((s = (Stud) os.readObject()) != null) {
                System.out.println(s.name + " " + s.roll + " " + s.total_marks);
                if (s.total_marks > 500) {
                    System.out.println("pass");
                } else {
                    System.out.println("fail");
                }
            }
        }

        catch(EOFException e){
            System.out.println("end of object");

            }
    }
}
