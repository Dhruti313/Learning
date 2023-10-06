package Arraylistandpractise;

import java.io.*;

public class Student implements Serializable {
    int id;
    String name;
    int marks;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public void display() {
        System.out.println(id + name + marks);
    }

    public static void main(String args[]) throws IOException, ClassNotFoundException {

        FileInputStream fr = new FileInputStream("D:\\cdac folder\\core java cdac pdf\\chiragfile.txt");
        ObjectInputStream or = new ObjectInputStream(fr);

        Student s;
        try {
            while ((s = (Student) or.readObject()) != null) {
                s.display();
                if (s.marks > 35) {
                    System.out.print("pass");
                } else {
                    System.out.print("fail");
                }
                System.out.println();
            }


        }
        catch (EOFException e) {
            System.out.println("end");
//}
//
//        Student s1 = new Student(101,"ram" , 100);
//        Student s2 = new Student(102,"ravi" , 200);
//        Student s3 = new Student(103,"shyam" , 300);
//
//        FileOutputStream fr = new FileOutputStream("D:\\cdac folder\\core java cdac pdf\\chiragfile.txt");
//        ObjectOutputStream ou = new ObjectOutputStream(fr);
//
//        ou.writeObject(s1);
//        ou.writeObject(s2);
//        ou.writeObject(s3);
//
//        ou.close();
//        System.out.println("object write is over");
        }
    }
}