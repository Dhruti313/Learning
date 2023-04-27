package OOPS;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Stud implements Serializable {
    int roll;
    String name;
    int total_marks;

    Stud(int roll , String name , int total_marks){
        this.roll = roll;
        this.name = name;
        this.total_marks = total_marks;

    }
    public String toString(){
      return roll +" "+name+" "+total_marks;

    }
}
class student_demo{
    public static void main(String args[]) throws IOException {
        Stud s1 = new Stud(101,"raj", 456);
        Stud s2 = new Stud(102,"rohit", 457);
        Stud s3 = new Stud(103,"shaym", 452);

        FileOutputStream fs = new FileOutputStream("dhruti");
        ObjectOutputStream os = new ObjectOutputStream(fs);

        os.writeObject(s1);
        os.writeObject(s2);
        os.writeObject(s3);

        os. close();
        System.out.println("over code");


    }
}

