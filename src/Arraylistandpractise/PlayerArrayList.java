package Arraylistandpractise;

public class PlayerArrayList {
    String name;
    int age;
    String countryname;
    int totalruns;

    public PlayerArrayList(String name , int age , String countryname , int totalruns ){
        this.name = name;
        this.age = age;
        this.countryname = countryname;
        this.totalruns = totalruns;

    }
    public void display(){
        if(totalruns > 5000){
            System.out.println(name+" "+ age+" "+countryname+" "+totalruns);
        }
    }
    public static void main(String args[]){
        PlayerArrayList p1 = new PlayerArrayList("Dhoni" ,42 , "India" , 10000);
        PlayerArrayList p2 = new PlayerArrayList("virat" ,39 , "sa" , 5001);
        PlayerArrayList p3 = new PlayerArrayList("rahul" ,40 , "us" , 1000);
        PlayerArrayList p4 = new PlayerArrayList("gambhir" ,41 , "uk" , 4000);
        PlayerArrayList p5 = new PlayerArrayList("sami" ,30 , "england" , 9000);

        p1.display();
        p2.display();
        p3.display();
        p4.display();
        p5.display();



    }
}
