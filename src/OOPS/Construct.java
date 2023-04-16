package OOPS;

public class Construct {
    String name;
    int Rollno;

    Construct(String s , int id){
        name = s;
        Rollno = id;
        System.out.println(name+ " "+Rollno);
   }
   public static void main(String args[]){
       Construct construct = new Construct("Dhruti", 121);
   }
}
